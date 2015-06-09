DESCRIPTION = "Check POD files for errors or warnings in a test file, using \
\"Pod::Simple\" to do the heavy lifting."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Pod"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DW/DWHEELER/Test-Pod-1.50.tar.gz"

SRC_URI[md5sum] = "6d94843add61471fa0b1ed49296000ef"
SRC_URI[sha256sum] = "2573d48c017bf1d9029c2305bcdfd0837c94f55c755109edb871f5c336554a37"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Test-Pod-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
