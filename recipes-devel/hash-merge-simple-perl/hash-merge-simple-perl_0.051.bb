DESCRIPTION = "Hash::Merge::Simple will recursively merge two or more hashes and return \
the result as a new hash reference. The merge function will descend and \
merge hashes that exist under the same node in both the left and right \
hash, but doesn't attempt to combine arrays, objects, scalars, or anything \
else. The rightmost hash also takes precedence, replacing whatever was in \
the left hash if a conflict occurs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-Merge-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RO/ROKR/Hash-Merge-Simple-0.051.tar.gz"

SRC_URI[md5sum] = "f47b9b99794b1f958bcfa3e816ff4660"
SRC_URI[sha256sum] = "1c56327873d2f04d5722777f044863d968910466997740d55a754071c6287b73"
RDEPENDS:${PN} += "clone-perl"
DEPENDS += "test-most-perl-native"

S = "${WORKDIR}/Hash-Merge-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
