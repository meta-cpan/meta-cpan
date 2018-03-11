DESCRIPTION = "Provides an easy way to obtain a connected DBI database handle by simply \
calling the database keyword within your Dancer2 application"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Plugin-Database"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BIGPRESH/Dancer2-Plugin-Database-2.17.tar.gz"

SRC_URI[md5sum] = "97331b7b9ee6fcf47a5d1ebb091fc95a"
SRC_URI[sha256sum] = "431f3405413366d2f36ebe0fd4661cc6d3c1354ba46018484799c0757dc638bd"
RDEPENDS_${PN} += "dancer-plugin-database-core-perl"
RDEPENDS_${PN} += "dancer2-perl"
DEPENDS += "http-message-perl-native"
DEPENDS += "plack-perl-native"

S = "${WORKDIR}/Dancer2-Plugin-Database-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
