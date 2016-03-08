DESCRIPTION = "Perl5 module to update file access and modification times"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Touch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/File-Touch-0.11.tar.gz"

SRC_URI[md5sum] = "caf4101a022f66c88f5fb4383b3f6388"
SRC_URI[sha256sum] = "e379a5ff89420cf39906e5ceff309b8ce958f99f9c3e57ad52b5002a3982d93c"

S = "${WORKDIR}/File-Touch-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
