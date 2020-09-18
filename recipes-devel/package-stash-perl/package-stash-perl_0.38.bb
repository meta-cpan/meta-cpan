DESCRIPTION = "Manipulating stashes (Perl's symbol tables) is occasionally necessary, but \
incredibly messy, and easy to get wrong. This module hides all of that \
behind a simple API."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-Stash"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Package-Stash-0.38.tar.gz"

SRC_URI[md5sum] = "dc2d802eea2cb0b52ed9c4dd178761dd"
SRC_URI[sha256sum] = "c58ee8844df2dda38e3bf66fdf443439aaefaef1a33940edf2055f0afd223a7f"
RDEPENDS_${PN} += "dist-checkconflicts-perl"
RDEPENDS_${PN} += "module-implementation-perl"
RRECOMMENDS_${PN} += "package-stash-xs-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Package-Stash-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
