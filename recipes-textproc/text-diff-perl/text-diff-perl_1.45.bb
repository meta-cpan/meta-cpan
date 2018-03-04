DESCRIPTION = ""diff()" provides a basic set of services akin to the GNU "diff" utility. \
It is not anywhere near as feature complete as GNU "diff", but it is better \
integrated with Perl and available on all platforms. It is often faster \
than shelling out to a system's "diff" executable for small files, and \
generally slower on larger files."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-Diff"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/Text-Diff-1.45.tar.gz"

SRC_URI[md5sum] = "edf57b6189f7651a6be454062a4e6d9c"
SRC_URI[sha256sum] = "e8baa07b1b3f53e00af3636898bbf73aec9a0ff38f94536ede1dbe96ef086f04"
RDEPENDS_${PN} += "algorithm-diff-perl"

S = "${WORKDIR}/Text-Diff-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
