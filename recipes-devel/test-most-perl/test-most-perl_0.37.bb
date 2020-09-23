DESCRIPTION = "Test::Most exists to reduce boilerplate and to make your testing life \
easier. We provide "one stop shopping" for most commonly used testing \
modules. In fact, we often require the latest versions so that you get bug \
fixes through Test::Most and don't have to keep upgrading these modules \
separately."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Most"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OV/OVID/Test-Most-0.37.tar.gz"

SRC_URI[md5sum] = "53d658737f2c07d3fb05167bf62687ed"
SRC_URI[sha256sum] = "533370141eb9f18cf4ac380f6ded2ab57802a6e184008a80fd2304bfcc474fc7"
RDEPENDS_${PN} += "exception-class-perl"
RDEPENDS_${PN} += "test-deep-perl"
RDEPENDS_${PN} += "test-differences-perl"
RDEPENDS_${PN} += "test-exception-perl"
RDEPENDS_${PN} += "test-warn-perl"

S = "${WORKDIR}/Test-Most-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
