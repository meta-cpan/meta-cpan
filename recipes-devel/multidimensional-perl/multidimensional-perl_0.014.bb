DESCRIPTION = "Perl's multidimensional array emulation stems from the days before the \
language had references, but these days it mostly serves to bite you when \
you typo a hash slice by using the "$" sigil instead of "@"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/multidimensional"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/multidimensional-0.014.tar.gz"

SRC_URI[md5sum] = "5a030f1fa297ca3c56269fa0c26b7300"
SRC_URI[sha256sum] = "12eb14317447bd15ab9799677db9eda20e784d8b113e44a5f6f11f529e862c5f"
RDEPENDS:${PN} += "b-hooks-op-check-perl"
DEPENDS += "b-hooks-op-check-perl-native"
DEPENDS += "extutils-depends-perl-native"

S = "${WORKDIR}/multidimensional-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
