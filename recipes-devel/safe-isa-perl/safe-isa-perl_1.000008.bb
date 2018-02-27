DESCRIPTION = "Call isa, can, does and DOES safely on things that may not be objects"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Safe-Isa"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Safe-Isa-1.000008.tar.gz"

SRC_URI[md5sum] = "71b93f27cc3a905976d4c01d2deac435"
SRC_URI[sha256sum] = "7db6d7d9be58d41ef8cd91bd86ffa025bce5ad4a59f265575c6315dc39242723"

S = "${WORKDIR}/Safe-Isa-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
