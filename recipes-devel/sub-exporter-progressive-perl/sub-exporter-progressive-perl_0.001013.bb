DESCRIPTION = "Sub::Exporter is an incredibly powerful module, but with that power comes \
great responsibility, er- as well as some runtime penalties. This module is \
a "Sub::Exporter" wrapper that will let your users just use Exporter if all \
they are doing is picking exports, but use "Sub::Exporter" if your users \
try to use "Sub::Exporter"'s more advanced features, like renaming exports, \
if they try to use them."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Exporter-Progressive"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/F/FR/FREW/Sub-Exporter-Progressive-0.001013.tar.gz"

SRC_URI[md5sum] = "72cf6acdd2a0a8b105821a4db98e4ebe"
SRC_URI[sha256sum] = "d535b7954d64da1ac1305b1fadf98202769e3599376854b2ced90c382beac056"

S = "${WORKDIR}/Sub-Exporter-Progressive-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
