DESCRIPTION = "This module exports a single function: "ttie". "ttie" ties a variable to a \
type constraint, ensuring that whatever values stored in the variable will \
conform to the type constraint. If the type constraint has coercions, these \
will be used if necessary to ensure values assigned to the variable \
conform."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tie"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tie-0.014.tar.gz"

SRC_URI[md5sum] = "f3d8639c6cf5a2debda203f9c86455fb"
SRC_URI[sha256sum] = "b5359514b8ee82d3ee07f65eb22dfe27ad4b2296161294264d65b53c561f22e6"
RDEPENDS_${PN} += "exporter-tiny-perl"
RRECOMMENDS_${PN} += "hash-fieldhash-perl"

S = "${WORKDIR}/Type-Tie-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
