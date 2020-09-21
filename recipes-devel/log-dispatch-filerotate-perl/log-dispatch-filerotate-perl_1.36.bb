DESCRIPTION = "This module extends the base class Log::Dispatch::Output to provides a \
simple object for logging to files under the Log::Dispatch::* system, and \
automatically rotating them according to different constraints. This is \
basically a Log::Dispatch::File wrapper with additions."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Dispatch-FileRotate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHOUT/Log-Dispatch-FileRotate-1.36.tar.gz"

SRC_URI[md5sum] = "d145b9af340d37cb2bb77c3766358573"
SRC_URI[sha256sum] = "472cb10b0fac6bbd67298bc28f1495859ad85b2df9e88c4a1f7eba734f88956e"
RDEPENDS_${PN} += "date-manip-perl"
RDEPENDS_${PN} += "log-dispatch-perl"
DEPENDS += "path-tiny-perl-native"
DEPENDS += "test-warn-perl-native"

S = "${WORKDIR}/Log-Dispatch-FileRotate-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
