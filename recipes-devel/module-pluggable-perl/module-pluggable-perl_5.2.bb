DESCRIPTION = "Provides a simple but, hopefully, extensible way of having 'plugins' for \
your module. Obviously this isn't going to be the be all and end all of \
solutions but it works for me."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Pluggable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SI/SIMONW/Module-Pluggable-5.2.tar.gz"

SRC_URI[md5sum] = "87ce2971662efd0b69a81bb4dc9ea76c"
SRC_URI[sha256sum] = "b3f2ad45e4fd10b3fb90d912d78d8b795ab295480db56dc64e86b9fa75c5a6df"
RRECOMMENDS_${PN} += "module-runtime-perl"

S = "${WORKDIR}/Module-Pluggable-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
