DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
STDOUT or STDERR. A number of different utilities are included to try \
and be as \
flexible as possible to the tester."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Output"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/B/BD/BDFOY/Test-Output-1.03.tar.gz"

SRC_URI[md5sum] = "903485edb382f5a18a5029978d1febf6"
SRC_URI[sha256sum] = "3110af65c6fc59b9fa46b08a47508c5e85f6edc6355f0879e28b11f9ad0c2989"
RDEPENDS_${PN} += "capture-tiny-perl"
RDEPENDS_${PN} += "sub-exporter-perl"
RDEPENDS_${PN} += "test-tester-perl"

S = "${WORKDIR}/Test-Output-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
