DESCRIPTION = "Sometimes we need data split into records and a simple split on the \
input record separator ($/) or some other value fails because the \
values we're \
splitting on may allowed in other parts of the data. Perhaps they're \
quoted. \
Perhaps they're embedded in other data which should not be split up."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-Record"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/O/OV/OVID/Data-Record-0.02.tar.gz"

SRC_URI[md5sum] = "1c22555d2ef4494d5991a12bb44a0e20"
SRC_URI[sha256sum] = "1d6ae66da2767520c21fbf12c538f1007ab27445d92c8eac763653f2b8849ebf"
RDEPENDS_${PN} += "sub-uplevel-perl"
DEPENDS += "test-exception-perl-native"

S = "${WORKDIR}/Data-Record-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
