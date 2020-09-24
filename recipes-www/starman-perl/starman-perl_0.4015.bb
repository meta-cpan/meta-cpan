DESCRIPTION = "Starman is a PSGI perl web server that has unique features such as:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Starman"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Starman-0.4015.tar.gz"

SRC_URI[md5sum] = "6318bf834964fe99a12a83fb6923b8d7"
SRC_URI[sha256sum] = "10f5097bca39a4327ff6e69e73f07609d3a659a7896be3964b49cc2412b133f8"
RDEPENDS_${PN} += "data-dump-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "http-parser-xs-perl"
RDEPENDS_${PN} += "net-server-perl"
RDEPENDS_${PN} += "plack-perl"
RDEPENDS_${PN} += "test-tcp-perl"
DEPENDS += "libwww-perl-perl-native"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Starman-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
