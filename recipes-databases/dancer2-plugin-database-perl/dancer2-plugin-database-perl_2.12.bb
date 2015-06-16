DESCRIPTION = "Provides an easy way to obtain a connected DBI database handle by \
simply calling the database keyword within your Dancer2 application"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Plugin-Database"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AM/AMBS/Dancer2-Plugin-Database-2.12.tar.gz"

SRC_URI[md5sum] = "9db547cb053bcb61c5bab8e5f6da0e32"
SRC_URI[sha256sum] = "21a94f5b41626e6d20a0431b5c848e1abbecb25a9353e3af0209eed453875518"
RDEPENDS_${PN} += "dancer-plugin-database-core-perl"
RDEPENDS_${PN} += "dancer2-perl"
DEPENDS += "http-message-perl-native"
DEPENDS += "plack-perl-native"

S = "${WORKDIR}/Dancer2-Plugin-Database-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
