DESCRIPTION = "Check POD files for errors or warnings in a test file, using \
\"Pod::Simple\" to do the heavy lifting."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Pod"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-Pod-1.51.tar.gz"

SRC_URI[md5sum] = "f806aa84de2f0c0fba48b3a5a8a4aecf"
SRC_URI[sha256sum] = "c1a1d3cedf4a579e3aad89c36f9878a8542b6656dbe71f1581420f49582d7efb"

S = "${WORKDIR}/Test-Pod-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
