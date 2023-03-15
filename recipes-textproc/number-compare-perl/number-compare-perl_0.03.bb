DESCRIPTION = "Number::Compare compiles a simple comparison to an anonymous subroutine, \
which you can call with a value to be tested again."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Number-Compare"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Number-Compare-0.03.tar.gz"

SRC_URI[md5sum] = "ded4085a8fc96328742785574ca65208"
SRC_URI[sha256sum] = "83293737e803b43112830443fb5208ec5208a2e6ea512ed54ef8e4dd2b880827"

S = "${WORKDIR}/Number-Compare-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
