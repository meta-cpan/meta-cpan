DESCRIPTION = "This module is a helper for installing, reading and finding configuration \
file locations. It's intended to work in every supported Perl5 environment \
and will always try to Do The Right Thing(TM)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ConfigDir-0.021.tar.gz"

SRC_URI[md5sum] = "5766f175d57a75f61466a591cf7236a1"
SRC_URI[sha256sum] = "6b405a14f69ce49d4982ed9b75400a445d0f6224fd7687fb907e79c5578314c6"
RRECOMMENDS_${PN} += "file-homedir-perl"
RRECOMMENDS_${PN} += "list-moreutils-perl"
RRECOMMENDS_${PN} += "list-moreutils-xs-perl"
DEPENDS += "test-without-module-perl-native"

S = "${WORKDIR}/File-ConfigDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
