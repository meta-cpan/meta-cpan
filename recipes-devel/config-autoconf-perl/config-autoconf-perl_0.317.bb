DESCRIPTION = "Config::AutoConf is intended to provide the same opportunities to Perl \
developers as GNU Autoconf <http://www.gnu.org/software/autoconf/> does for \
Shell developers."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Config-AutoConf"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Config-AutoConf-0.317.tar.gz"

SRC_URI[md5sum] = "29f87fc7803f1725f6daafcf416089ce"
SRC_URI[sha256sum] = "01e4b22d2fecb7cfd3cc1f4dabe95cd137cf249cc5e38184f88556e5c98a9ce1"
RDEPENDS_${PN} += "capture-tiny-perl"
RRECOMMENDS_${PN} += "extutils-cbuilder-perl"
RRECOMMENDS_${PN} += "file-slurp-tiny-perl"

S = "${WORKDIR}/Config-AutoConf-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
