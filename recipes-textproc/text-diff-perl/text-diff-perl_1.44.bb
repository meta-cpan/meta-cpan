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

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/Text-Diff-1.44.tar.gz"

SRC_URI[md5sum] = "1f0bcd24b64b50a29ad1cf997c2247e9"
SRC_URI[sha256sum] = "57f7a0bed7d085d34a3ffab3a68140d7b816737c87b831086b4c0945bf483b10"
RDEPENDS_${PN} += "algorithm-diff-perl"

S = "${WORKDIR}/Text-Diff-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
