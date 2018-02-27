DESCRIPTION = "A good style of Perl programming calls for a lot of diverse regression \
tests."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Warn"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BIGJ/Test-Warn-0.32.tar.gz"

SRC_URI[md5sum] = "3210a070680ea24437ebfd2be26bbfcd"
SRC_URI[sha256sum] = "2fc516e71f9ef453be22a4619d91eb3f78df414a57dfa0fd745d3bff50bf73d2"
RDEPENDS_${PN} += "sub-uplevel-perl"

S = "${WORKDIR}/Test-Warn-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
