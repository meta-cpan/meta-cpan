DESCRIPTION = "This module extends the base class Log::Dispatch::Output to provides a \
simple object for logging to files under the Log::Dispatch::* system, and \
automatically rotating them according to different constraints. This is \
basically a Log::Dispatch::File wrapper with additions."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch-FileRotate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHOUT/Log-Dispatch-FileRotate-1.38.tar.gz"

SRC_URI[md5sum] = "eed7814b9d291d5f7267d578e099c102"
SRC_URI[sha256sum] = "b55d6cede3f0a06426488fbfa554f4561320b014c1023893ced29508e5bce4ec"
RDEPENDS:${PN} += "date-manip-perl"
RDEPENDS:${PN} += "log-dispatch-perl"
DEPENDS += "path-tiny-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Log-Dispatch-FileRotate-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
