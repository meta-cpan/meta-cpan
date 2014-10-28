DESCRIPTION = "This class is the base class for all time zone objects. A time zone is \
represented internally as a set of observances, each of which describes \
the \
offset from GMT for a given time period."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-TimeZone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-TimeZone-1.76.tar.gz"

SRC_URI[md5sum] = "9aeccf8c911c8e3ec18c8194de3a3840"
SRC_URI[sha256sum] = "6e96779ed04c81979d72b1a02bf12726b408e4b99169d4c9882414a19ebbb2b0"
RDEPENDS_${PN} += "class-load-perl"
RDEPENDS_${PN} += "class-singleton-perl"
RDEPENDS_${PN} += "list-allutils-perl"
RDEPENDS_${PN} += "params-validate-perl"
DEPENDS += "extutils-makemaker-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-output-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/DateTime-TimeZone-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
