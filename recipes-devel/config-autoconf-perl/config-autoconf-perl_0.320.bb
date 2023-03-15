DESCRIPTION = "Config::AutoConf is intended to provide the same opportunities to Perl \
developers as GNU Autoconf <http://www.gnu.org/software/autoconf/> does for \
Shell developers."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-AutoConf"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/Config-AutoConf-0.320.tar.gz"

SRC_URI[md5sum] = "71664b2864232e265179ac29298e0916"
SRC_URI[sha256sum] = "bb57a958ef49d3f7162276dae14a7bd5af43fd1d8513231af35d665459454023"
RDEPENDS:${PN} += "capture-tiny-perl"
RRECOMMENDS:${PN} += "extutils-cbuilder-perl"
RRECOMMENDS:${PN} += "file-slurper-perl"

S = "${WORKDIR}/Config-AutoConf-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
