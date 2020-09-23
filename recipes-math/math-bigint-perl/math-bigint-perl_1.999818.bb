DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-BigInt"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PJ/PJACKLAM/Math-BigInt-1.999818.tar.gz"

SRC_URI[md5sum] = "a6e5a6c391b453e04c2b60506e1b5342"
SRC_URI[sha256sum] = "b27634356ce2af9b7c0123ac8395a89a32fb15aeae82fcd39de8156cad278c15"

S = "${WORKDIR}/Math-BigInt-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
