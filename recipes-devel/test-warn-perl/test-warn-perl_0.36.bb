DESCRIPTION = "A good style of Perl programming calls for a lot of diverse regression \
tests."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Warn"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BIGJ/Test-Warn-0.36.tar.gz"

SRC_URI[md5sum] = "3d958f43d36db263994affde5da09b51"
SRC_URI[sha256sum] = "ecbca346d379cef8d3c0e4ac0c8eb3b2613d737ffaaeae52271c38d7bf3c6cda"
RDEPENDS_${PN} += "sub-uplevel-perl"

S = "${WORKDIR}/Test-Warn-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
