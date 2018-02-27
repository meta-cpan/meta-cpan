DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-BigInt"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PJ/PJACKLAM/Math-BigInt-1.999811.tar.gz"

SRC_URI[md5sum] = "95116cb6c22359f4d5d64abde083376d"
SRC_URI[sha256sum] = "d4bfa5ad0127b6360ad29971da6fa08bcfb56a471d55db3c7419d05f8a947b8d"

S = "${WORKDIR}/Math-BigInt-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
