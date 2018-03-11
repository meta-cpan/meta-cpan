DESCRIPTION = "This package lets you create and manipulate complex numbers. By default, \
*Perl* limits itself to real numbers, but an extra "use" statement brings \
full complex support, along with a full set of mathematical functions \
typically associated with and/or extended to complex numbers."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Math-Complex"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/Z/ZE/ZEFRAM/Math-Complex-1.59.tar.gz"

SRC_URI[md5sum] = "94f9d6b557b56408949928a55227c86f"
SRC_URI[sha256sum] = "f35eb4987512c51d2c47294a008ede210d8dd759b90b887d04847c69b42dd6d1"

S = "${WORKDIR}/Math-Complex-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
