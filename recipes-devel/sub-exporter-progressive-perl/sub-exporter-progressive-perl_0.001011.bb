DESCRIPTION = "Sub::Exporter is an incredibly powerful module, but with that power \
comes great responsibility, er- as well as some runtime penalties. This \
module is \
a "Sub::Exporter" wrapper that will let your users just use Exporter if \
all \
they are doing is picking exports, but use "Sub::Exporter" if your \
users try \
to use "Sub::Exporter"'s more advanced features, like renaming exports, \
if \
they try to use them."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Exporter-Progressive"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/F/FR/FREW/Sub-Exporter-Progressive-0.001011.tar.gz"

SRC_URI[md5sum] = "bb50b3ba1538902b197c04818a84230a"
SRC_URI[sha256sum] = "0618c6e69c6c0540c41e7560d51981407a6a0768f1330bef6d6ac3c6f1fa7c06"

S = "${WORKDIR}/Sub-Exporter-Progressive-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
