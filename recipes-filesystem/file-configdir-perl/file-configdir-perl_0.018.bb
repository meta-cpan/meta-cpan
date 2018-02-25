DESCRIPTION = "This module is a helper for installing, reading and finding configuration \
file locations. It's intended to work in every supported Perl5 environment \
and will always try to Do The Right Thing(tm)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ConfigDir-0.018.tar.gz"

SRC_URI[md5sum] = "29af3077f3c66a0b463f938e5f194a7b"
SRC_URI[sha256sum] = "2e8b9f082db395539230f7696d2cd85c83b9b8f3f73e53e999533fa03ccdfff6"
RRECOMMENDS_${PN} += "file-homedir-perl"
RRECOMMENDS_${PN} += "list-moreutils-perl"

S = "${WORKDIR}/File-ConfigDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
