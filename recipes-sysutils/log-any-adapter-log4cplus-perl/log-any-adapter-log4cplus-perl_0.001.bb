DESCRIPTION = "This Log::Any adapter uses Lib::Log4cplus for logging."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any-Adapter-Log4cplus"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Log-Any-Adapter-Log4cplus-0.001.tar.gz"

SRC_URI[md5sum] = "000e343bf065960e6abfcae237ff00ca"
SRC_URI[sha256sum] = "5d8e7776cc7931fa9fe0bb1f825feed44911ac3492e31908b657d681336324d2"
RDEPENDS:${PN} += "lib-log4cplus-perl"
RDEPENDS:${PN} += "log-any-perl"

S = "${WORKDIR}/Log-Any-Adapter-Log4cplus-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
