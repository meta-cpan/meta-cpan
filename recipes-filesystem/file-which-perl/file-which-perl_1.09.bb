DESCRIPTION = ""File::Which\" was created to be able to get the paths to executable \
programs on systems under which the `which' program wasn't implemented \
in the shell."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Which"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/File-Which-1.09.tar.gz"

SRC_URI[md5sum] = "b9429edaad7f45caafa4d458afcfd8af"
SRC_URI[sha256sum] = "b72fec6590160737cba97293c094962adf4f7d44d9e68dde7062ecec13f4b2c3"
RDEPENDS_${PN} += "test-script-perl"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
