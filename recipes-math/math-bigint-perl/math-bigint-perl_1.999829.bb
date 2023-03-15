DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-BigInt"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PJ/PJACKLAM/Math-BigInt-1.999829.tar.gz"

SRC_URI[md5sum] = "fd64ffafb1ec5cb7a0fa41b25a4bf894"
SRC_URI[sha256sum] = "6508738b1bb0021e7fc766e376540057634a3a57b077d32cbc3f42a4599a7bee"

S = "${WORKDIR}/Math-BigInt-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
