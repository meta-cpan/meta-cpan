DESCRIPTION = "The \"Digest::MD5\" module allows you to use the RSA Data Security Inc. \
MD5 Message Digest algorithm from within Perl programs. The algorithm \
takes as \
input a message of arbitrary length and produces as output a 128-bit \
\"fingerprint\" or \"message digest\" of the input."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Digest-MD5"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GAAS/Digest-MD5-2.54.tar.gz"

SRC_URI[md5sum] = "bb2c9e79a8fd181abcb3071e94d7c099"
SRC_URI[sha256sum] = "90de11e3743ef1c753a5c2032b434e09472046fbcf346996cbe5d135b217f390"

S = "${WORKDIR}/Digest-MD5-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
