DESCRIPTION = "See MooX::Types::MooseLike::Base for a list of available base types. \
Its source also provides an example of how to build base types, along \
with both \
parameterizable and non-parameterizable."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Types-MooseLike"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MA/MATEU/MooX-Types-MooseLike-0.27.tar.gz"

SRC_URI[md5sum] = "049e99292aa848454ae1e42b09603fa9"
SRC_URI[sha256sum] = "ee35e2d85d48bb2785449a4fa42c67513e843c803a0d5074665f54a52b550991"
RDEPENDS_${PN} += "module-runtime-perl"
DEPENDS += "moo-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/MooX-Types-MooseLike-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
