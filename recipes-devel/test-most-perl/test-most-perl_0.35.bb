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

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OV/OVID/Test-Most-0.35.tar.gz"

SRC_URI[md5sum] = "03dbabd34d6f40af8bd47f5fbb0c6989"
SRC_URI[sha256sum] = "9897a6f4d751598d2ed1047e01c1554b01d0f8c96c45e7e845229782bf6f657f"
RDEPENDS_${PN} += "exception-class-perl"
RDEPENDS_${PN} += "test-deep-perl"
RDEPENDS_${PN} += "test-differences-perl"
RDEPENDS_${PN} += "test-exception-perl"
RDEPENDS_${PN} += "test-warn-perl"

S = "${WORKDIR}/Test-Most-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
