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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Config-AutoConf-0.318.tar.gz"

SRC_URI[md5sum] = "0bea721ad3996e20324b84b3b924ec71"
SRC_URI[sha256sum] = "33c930feec3003de251ca222abe8bbeb74610ad07f65fc16f27d74d195eeab34"
RDEPENDS_${PN} += "capture-tiny-perl"
RRECOMMENDS_${PN} += "extutils-cbuilder-perl"
RRECOMMENDS_${PN} += "file-slurper-perl"

S = "${WORKDIR}/Config-AutoConf-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
