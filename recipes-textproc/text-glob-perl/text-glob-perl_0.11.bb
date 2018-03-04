DESCRIPTION = "Text::Glob implements glob(3) style matching that can be used to match \
against text, rather than fetching names from a filesystem. If you want to \
do full file globbing use the File::Glob module instead."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Text-Glob"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RC/RCLAMP/Text-Glob-0.11.tar.gz"

SRC_URI[md5sum] = "d001559c504a2625dd117bd1558f07f7"
SRC_URI[sha256sum] = "069ccd49d3f0a2dedb115f4bdc9fbac07a83592840953d1fcdfc39eb9d305287"

S = "${WORKDIR}/Text-Glob-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
