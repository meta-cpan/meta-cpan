DESCRIPTION = "comprehensive template processing system"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Template-Toolkit"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABW/Template-Toolkit-2.27.tar.gz"

SRC_URI[md5sum] = "a7fae5d4fe5918f33105d92a62134067"
SRC_URI[sha256sum] = "1311a403264d0134c585af0309ff2a9d5074b8ece23ece5660d31ec96bf2c6dc"
RDEPENDS_${PN} += "appconfig-perl"
DEPENDS += "cgi-perl-native"
DEPENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Template-Toolkit-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
