DESCRIPTION = "MIME types are used in many applications (for instance as part of \
e-mail and HTTP traffic) to indicate the type of content which is transmitted or \
expected. See RFC2045 at https://www.ietf.org/rfc/rfc2045.txt"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Types"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MA/MARKOV/MIME-Types-2.09.tar.gz"

SRC_URI[md5sum] = "99952df4f4a1e2e31eb80d98b6197774"
SRC_URI[sha256sum] = "2cccaf8fa5e3963f45106188923c98666402948a00cd9c0a15cc06d6d317fa68"

S = "${WORKDIR}/MIME-Types-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
