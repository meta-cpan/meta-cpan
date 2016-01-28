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

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/Text-Diff-1.43.tar.gz"

SRC_URI[md5sum] = "49ee558984cb85b81bbc8fe5cf7324c3"
SRC_URI[sha256sum] = "4c2d837c355c3f212044331f6712b5191a6cebc21c47c1157b4bb13283acb7aa"
RDEPENDS_${PN} += "algorithm-diff-perl"

S = "${WORKDIR}/Text-Diff-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
