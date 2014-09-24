DESCRIPTION = "This modules handles International Standard Book Numbers, including \
ISBN-10 and ISBN-13."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Business-ISBN"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/B/BD/BDFOY/Business-ISBN-2.09.tar.gz"

SRC_URI[md5sum] = "5ebf339c409d99cdfa6f96974ef96780"
SRC_URI[sha256sum] = "99c439e568869bc9e65601a9ff16a38fbd6eafd17c81bd4d88eafa2ef9fb123a"
RDEPENDS_${PN} += "business-isbn-data-perl"

S = "${WORKDIR}/Business-ISBN-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
