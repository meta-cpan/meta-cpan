DESCRIPTION = "This modules handles International Standard Book Numbers, including \
ISBN-10 and ISBN-13."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-2.07.tar.gz"

SRC_URI[md5sum] = "c0049fb576b9fc3b2603bf7e9b3e91af"
SRC_URI[sha256sum] = "4c11279580872bf3cc7176bb75c25b165d4b59a2828fc43d9a355cec3d0a45ff"

S = "${WORKDIR}/Business-ISBN-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
