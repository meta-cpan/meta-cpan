DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-BigInt"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PJ/PJACKLAM/Math-BigInt-1.999816.tar.gz"

SRC_URI[md5sum] = "879409c5c62441a675853cabe690b313"
SRC_URI[sha256sum] = "95a5a1f636a23f66d400d40bffb0d24ad50df00e6e3c7359c9e645c375f40a89"

S = "${WORKDIR}/Math-BigInt-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
