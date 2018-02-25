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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Config-AutoConf-0.315.tar.gz"

SRC_URI[md5sum] = "710ca59bc75974b9f4dbc3f1618f5fe1"
SRC_URI[sha256sum] = "4b3cd1e1a698ba9e5660c047f0a4fe192723d4bc9f768fdea511c2fc73ea6940"
RDEPENDS_${PN} += "capture-tiny-perl"
RRECOMMENDS_${PN} += "extutils-cbuilder-perl"
RRECOMMENDS_${PN} += "file-slurp-tiny-perl"

S = "${WORKDIR}/Config-AutoConf-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
