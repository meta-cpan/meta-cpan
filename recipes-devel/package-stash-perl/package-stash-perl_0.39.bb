DESCRIPTION = "Manipulating stashes (Perl's symbol tables) is occasionally necessary, but \
incredibly messy, and easy to get wrong. This module hides all of that \
behind a simple API."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Package-Stash"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Package-Stash-0.39.tar.gz"

SRC_URI[md5sum] = "287d80c9115c9230912aca684f8ca92e"
SRC_URI[sha256sum] = "9165f555112e080493ce0e9129de0886da30b2593fb353a2abd1c76b2d2621b5"
RDEPENDS:${PN} += "dist-checkconflicts-perl"
RDEPENDS:${PN} += "module-implementation-perl"
RRECOMMENDS:${PN} += "package-stash-xs-perl"
DEPENDS += "cpan-meta-check-perl-native"
DEPENDS += "test-needs-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Package-Stash-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
