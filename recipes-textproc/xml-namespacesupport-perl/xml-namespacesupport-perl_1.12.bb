DESCRIPTION = "This module offers a simple to process namespaced XML names (unames) from \
within any application that may need them. It also helps maintain a prefix \
to namespace URI map, and provides a number of basic checks."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-NamespaceSupport"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PERIGRIN/XML-NamespaceSupport-1.12.tar.gz"

SRC_URI[md5sum] = "a8916c6d095bcf073e1108af02e78c97"
SRC_URI[sha256sum] = "47e995859f8dd0413aa3f22d350c4a62da652e854267aa0586ae544ae2bae5ef"

S = "${WORKDIR}/XML-NamespaceSupport-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
