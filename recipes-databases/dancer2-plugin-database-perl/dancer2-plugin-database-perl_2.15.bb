DESCRIPTION = "Provides an easy way to obtain a connected DBI database handle by simply \
calling the database keyword within your Dancer2 application"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Plugin-Database"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/Dancer2-Plugin-Database-2.15.tar.gz"

SRC_URI[md5sum] = "ae0a5ada97cf2c90b1b22251c3062181"
SRC_URI[sha256sum] = "a603831d2151606e6b6ccbdfb2576603bfcfe7f24b2ec72e6a2a9373bb600813"
RDEPENDS_${PN} += "dancer-plugin-database-core-perl"
RDEPENDS_${PN} += "dancer2-perl"
DEPENDS += "http-message-perl-native"
DEPENDS += "plack-perl-native"

S = "${WORKDIR}/Dancer2-Plugin-Database-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
