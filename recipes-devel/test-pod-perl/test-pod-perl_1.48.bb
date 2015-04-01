DESCRIPTION = "Check POD files for errors or warnings in a test file, using \
\"Pod::Simple\" to do the heavy lifting."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Pod"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DW/DWHEELER/Test-Pod-1.48.tar.gz"

SRC_URI[md5sum] = "c6bfd00ccdcb417d68fb3c0a0ec884c8"
SRC_URI[sha256sum] = "2478cea781d3740ff4ce1432770707248fb3145946244a6d96e459bf14e4bcc2"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Test-Pod-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
