DESCRIPTION = "Starman is a PSGI perl web server that has unique features such as:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Starman"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Starman-0.4014.tar.gz"

SRC_URI[md5sum] = "12e40b068e6f6f5a4993ef5780ab644b"
SRC_URI[sha256sum] = "a5772c18aa89ea42208c24eae4c91246de222b9b6f4a1720cd02e93d562e6be9"
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

inherit cpan_build

BBCLASSEXTEND = "native"
