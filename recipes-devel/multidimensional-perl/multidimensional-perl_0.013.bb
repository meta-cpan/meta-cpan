DESCRIPTION = "Perl's multidimensional array emulation stems from the days before the \
language had references, but these days it mostly serves to bite you when \
you typo a hash slice by using the "$" sigil instead of "@"."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/multidimensional"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/multidimensional-0.013.tar.gz"

SRC_URI[md5sum] = "60113584ddf6daf651998b7f01cf2cc4"
SRC_URI[sha256sum] = "3d20ce3e2307c3cfb13f2d53ad99bba6f87ea20b53f7ffebb4308d88ccfee50a"
RDEPENDS_${PN} += "b-hooks-op-check-perl"
RDEPENDS_${PN} += "lexical-sealrequirehints-perl"
DEPENDS += "b-hooks-op-check-perl-native"
DEPENDS += "extutils-depends-perl-native"

S = "${WORKDIR}/multidimensional-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
