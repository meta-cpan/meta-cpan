DESCRIPTION = "This module is a helper for easily find configuration file locations. \
Whether to use this information for find a suitable place for installing \
them or looking around for finding any piece of settings, heavily depends \
on the requirements."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-File-ConfigDir"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-File-ConfigDir-0.007.tar.gz"

SRC_URI[md5sum] = "0b1adc9390fbf51611e0fa853827f919"
SRC_URI[sha256sum] = "1fea3a132d4c19902d4326e948d8a0e1acfc01d28861608387adadcc41099b1c"
RDEPENDS_${PN} += "file-configdir-perl"
RDEPENDS_${PN} += "moo-perl"

S = "${WORKDIR}/MooX-File-ConfigDir-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
