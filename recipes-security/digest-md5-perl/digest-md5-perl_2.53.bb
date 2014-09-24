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

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/Digest-MD5-2.53.tar.gz"

SRC_URI[md5sum] = "affc629d05c4c7b3efe4b3b874bce528"
SRC_URI[sha256sum] = "cde667c0c0c8a4d819d332ba9a4cad7e9f75fc7cabd490aae405ce7bc54d5152"

S = "${WORKDIR}/Digest-MD5-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
