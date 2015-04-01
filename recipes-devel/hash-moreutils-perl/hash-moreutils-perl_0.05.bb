DESCRIPTION = "Similar to \"List::MoreUtils\", \"Hash::MoreUtils\" contains trivial \
but commonly-used functionality for hashes."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/Hash-MoreUtils-0.05.tar.gz"

SRC_URI[md5sum] = "3ad192bffc593aa0048c65be04435a33"
SRC_URI[sha256sum] = "5e9c8458457eb18315a5669e3bef68488cd5ed8c2220011ac7429ff983288ab1"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Hash-MoreUtils-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
